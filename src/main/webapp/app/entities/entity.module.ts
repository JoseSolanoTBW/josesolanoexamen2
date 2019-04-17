import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
    imports: [
        RouterModule.forChild([
            {
                path: 'review',
                loadChildren: './review/review.module#Examen2ReviewModule'
            },
            {
                path: 'story',
                loadChildren: './story/story.module#Examen2StoryModule'
            },
            {
                path: 'student',
                loadChildren: './student/student.module#Examen2StudentModule'
            },
            {
                path: 'team',
                loadChildren: './team/team.module#Examen2TeamModule'
            },
            {
                path: 'student',
                loadChildren: './student/student.module#Examen2StudentModule'
            },
            {
                path: 'student',
                loadChildren: './student/student.module#Examen2StudentModule'
            },
            {
                path: 'review',
                loadChildren: './review/review.module#Examen2ReviewModule'
            },
            {
                path: 'review',
                loadChildren: './review/review.module#Examen2ReviewModule'
            },
            {
                path: 'project',
                loadChildren: './project/project.module#Examen2ProjectModule'
            },
            {
                path: 'team',
                loadChildren: './team/team.module#Examen2TeamModule'
            }
            /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
        ])
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class Examen2EntityModule {}
