import { Moment } from 'moment';

export interface IReview {
    id?: string;
    timestamp?: Moment;
    comment?: string;
    status?: string;
}

export class Review implements IReview {
    constructor(public id?: string, public timestamp?: Moment, public comment?: string, public status?: string) {}
}
