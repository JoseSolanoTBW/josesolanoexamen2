import { IStudent } from 'app/shared/model/student.model';

export interface ITeam {
    id?: string;
    name?: string;
    status?: string;
    students?: IStudent[];
}

export class Team implements ITeam {
    constructor(public id?: string, public name?: string, public status?: string, public students?: IStudent[]) {}
}
