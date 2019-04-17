import { IStory } from 'app/shared/model/story.model';
import { ITeam } from 'app/shared/model/team.model';

export interface IStudent {
    id?: string;
    name?: string;
    lastName?: string;
    role?: string;
    status?: string;
    userStories?: IStory[];
    team?: ITeam;
}

export class Student implements IStudent {
    constructor(
        public id?: string,
        public name?: string,
        public lastName?: string,
        public role?: string,
        public status?: string,
        public userStories?: IStory[],
        public team?: ITeam
    ) {}
}
